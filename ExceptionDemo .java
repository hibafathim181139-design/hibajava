classExceptionDemo {
public static void main(string args[])
}
try {
int a=10;
int b=0;
int c=a/b;
system.out.println(c);
}
catch(ArithmeticException e){
System.out.println("Cannot divide by zero");
}
}
}
class ArrayException{
public static void main(String args[]){
try{
int a[]={10,20,30};
System.out.println(a[5]);
}
catch
(ArrayIndexOutOfBoundsException e){
System.out.println("Array index is out of range");
}
}
}
class MultipleCatch{
public static void main(String args[]){
try{
int a[]={10,20,30};
int x=10/0;
System.out.println("Arithmetic Exception occurred");
}
catch 
(ArrayIndexOutOfBoundsException e){
System.out.println("Array Index Exception occurred");
}
}
}
