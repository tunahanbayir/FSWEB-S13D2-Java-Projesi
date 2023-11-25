public class Main {
    public static void main(String[] args) {


        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }



public static boolean isPalindrome(int number){
    number = Math.abs(number);
    String stringValue = string.valueOf(number);
    char[] basamaklar = stringValue.toCharArray();
    String reversedValue = "";
    for (int i = basamaklar.length - 1; >= 0; i--){
        reversedValue += basamaklar[i];
    }
    return stringValue.equals(reversedValue);

    }

 public static boolean isPerfectNumber(int number){
    if (number < 0){
        return false;
    }
    int total = 0;

    for (int i = 1; i < number; i++) {
        if (number%i == 0){
            total += i;
        }

    return total == number;
 }


 public static String numberToWords(int sayi){
        String strSayi = String.valueOf(sayi);
        char[] charsStrSayi = strSayi.toCharArray();
        String[] rakamlar = {"zero ", "one ", "two ", "three , ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        String sonuc = "";

        for (char charStrSayi : charsStrSayi){
            sonuc += rakamlar[Integer.parseInt(String.valueOf(charStrSayi))];
        }
        return sonuc.trim();
 }
}