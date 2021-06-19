package practice01;

public class Practice {

    public static boolean isLeapYear(int year){

        boolean answer = false;

        if((year % 4 == 0)){ // if year is divisiable by 4 is leap year => else is false leap year
            if((year % 100 == 0)){ // if this is divisiable by 4 and divisible by 100 is NOT leap year => else is true leap year
                if((year % 400 == 0)){ // if is divisible by  4  and  100 and  400 its true
                    answer = true;
                }
            }
            else{ //Not divisiable by 100 which makes it good
                answer = true;
            }
        }
        else{//Not divisible by 4 not leap year
            answer = false;
        }
        return answer;
    }

    public static int Fib(int pos){

        //Declaring variables and properties
        int storageBucket[] = new int[pos + 1];
        int numberBefore ;
        int storedNumber;
        int storedSum;


        //Initialazing variables and array positions
        numberBefore = storageBucket[0] =0;
        storedNumber = storageBucket[1] =1;


        for(int i = 2 ; i < pos ; i++) {

            storedSum = numberBefore + storedNumber;

            storageBucket[i] = storedSum;

            numberBefore = storedNumber;

            storedNumber = storedSum;
        }

        int index = 4;

        return storageBucket[index];
    }
}
