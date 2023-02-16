public class UsingVariables {
    public static void main(String[] args) {
        byte byteVar;
        boolean boolVar;
        float fVar1;
        float fVar2;

        byteVar = 5;
        boolVar = true;
        fVar1 = 3.7f;
        fVar2 = 5.5f;

        System.out.println("The current value of byteVar is " + byteVar);
        System.out.println("The current value of boolVar is " + boolVar);
        System.out.println("The current value of fVar1 is " + fVar1);
        System.out.println("The current value of fVar2 is " + fVar2);


        byteVar = 8;
        boolVar = false;
        fVar1 = 21.4f;
        fVar2 = 39.5f;

        System.out.println();
        System.out.println("The new value of byteVar is " + byteVar);
        System.out.println("The new value of boolVar is " + boolVar);
        System.out.println("The new value of fVar1 is " + fVar1);
        System.out.println("The new value of fVar2 is " + fVar2);


        float temp = fVar1;
        fVar1 = fVar2;
        fVar2 = temp;

       // fVar1 = fVar2+fVar1;
       // fVar2 = fVar1-fVar2;
       // fVar1 = fVar1-fVar2;

        System.out.println();
        System.out.println("After the swap, fVar1 = " + fVar1);
        System.out.println("After the swap, fVar2 = " + fVar2);

    }
}
