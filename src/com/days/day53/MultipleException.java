package com.days.day53;

public class MultipleException {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        String name = null;
        try {
            System.out.println("code1");
            System.out.println("code2");
            System.out.println("code3");
            System.out.println(num1 / num2);
            System.out.println("name.length() = " + name.length());
            System.out.println("code4");
            System.out.println("code5");

        } catch (ArithmeticException | NullPointerException  e) {
            System.out.println("reset db connection!!");
        }

//        }catch (Exception e){
//            System.out.println("reset db connection!!");
//        } catch (ArithmeticException a) {
//            System.out.println("reset db connection!!");
//        } catch (NullPointerException n) {
//            System.out.println("reset db connection!!");
//        }


//        System.out.println(1/0);

    }
}
