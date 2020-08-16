package Strings;

public class NumberACamelCase {
    public static void main(String[] args){
        String s = "saveChangesInTheEditor";
        int count = 1;
        for(int i=0; i< s.length(); i++){
            if (Character.isUpperCase(s.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
// So I have a counter whose initial value is 1;
// For loop going through each element; checks if there is a capital letter, adds one to the counter on finding
// how do you check uppercase characters in java?: isUppercase()