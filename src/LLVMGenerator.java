
class LLVMGenerator{

   static String header_text = "";
   static String main_text = "";
   static int reg = 1;
   static int sup = 0;

   static void printf_i32(String id){
      main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
      reg++;
      main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_double(String id){
      main_text += "%"+reg+" = load double, double* %"+id+"\n";
      reg++;
      main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_arrayIntAt(String id, int size, int index){

      main_text += "%"+reg+"= getelementptr inbounds ["+size+" x i32], ["+size+" x i32]* %"+id+", i64 0, i64 " + index+"\n";
      reg++;
      main_text += "%"+reg+" = load i32, i32* %"+(reg-1)+"\n";
      reg++;
      main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_arrayFloatAt(String id, int size, int index){

      main_text += "%"+reg+"= getelementptr inbounds ["+size+" x double], ["+size+" x double]* %"+id+", i64 0, i64 " + index+"\n";
      reg++;
      main_text += "%"+reg+" = load double, double* %"+(reg-1)+"\n";
      reg++;
      main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_string(String id, int size){
      main_text += "%sup"+sup+" = getelementptr inbounds ["+size+" x i8], ["+size+" x i8]* @." + id +", i32 0, i32 0\n";
      main_text += "call i32 (i8*, ...) @printf(i8* %sup"+sup+")\n";
      sup++;
   }

   static void declare_string(String id, String value, int size){
      header_text += "@."+id+" = private constant ["+size+" x i8] c\""+value+"\"\n";
   }

   static void declare_i32(String id){
      main_text += "%"+id+" = alloca i32\n";
   }

   static void declare_double(String id){
      main_text += "%"+id+" = alloca double\n";
   }
   static void declare_intArray(String id, int size)
   {
      main_text += "%"+id+" = alloca [" + size + " x i32], align 16\n";
   }
   static void declare_floatArray(String id, int size)
   {
      main_text += "%"+id+" = alloca [" + size + " x double], align 16\n";
   }

   static void assign_i32(String id, String value){
      main_text += "store i32 "+value+", i32* %"+id+"\n";
   }

   static void assign_double(String id, String value){
      main_text += "store double "+value+", double* %"+id+"\n";
   }

   static void assign_intArray(String id, String value, int size, int index){
      main_text += "%"+ reg +" = getelementptr inbounds ["+size+" x i32], ["+size+" x i32]* %"+id+", i64 0, i64 " + index +"\n";
      main_text += "store i32 "+value+", i32* %"+ reg +", align 16\n";
      reg++;
   }

   static void assign_floatArray(String id, String value, int size, int index){
      main_text += "%"+ reg +" = getelementptr inbounds ["+size+" x double], ["+size+" x double]* %"+id+", i64 0, i64 " + index +"\n";
      main_text += "store double "+value+", double* %"+ reg +", align 16\n";
      reg++;
   }


   static void scanf(String id){
      main_text += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strs, i32 0, i32 0), i32* %"+id+")\n";
      reg++;
   }


   static void load_i32(String id){
      main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
      reg++;
   }

   static void load_double(String id){
      main_text += "%"+reg+" = load double, double* %"+id+"\n";
      reg++;
   }

   static void add_i32(String val1, String val2){
      main_text += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void add_double(String val1, String val2){
      main_text += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
      reg++;
   }

   static void sub_i32(String val1, String val2) {
      main_text += "%" + reg + " = sub i32 " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void sub_double(String val1, String val2) {
      main_text += "%" + reg + " = fsub double " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void mult_i32(String val1, String val2){
      main_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void mult_double(String val1, String val2){
      main_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
      reg++;
   }

   static void div_i32(String val1, String val2) {
      main_text += "%" + reg + " = udiv i32 " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void div_double(String val1, String val2) {
      main_text += "%" + reg + " = fdiv double " + val2 + ", " + val1 + "\n";
      reg++;
   }

   static void sitofp(String id){
      main_text += "%"+reg+" = sitofp i32 "+id+" to double\n";
      reg++;
   }

   static void fptosi(String id){
      main_text += "%"+reg+" = fptosi double "+id+" to i32\n";
      reg++;
   }


   static String generate(){
      String text = "";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
      text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
      text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;
      text += "ret i32 0 }\n";
      return text;
   }

}
