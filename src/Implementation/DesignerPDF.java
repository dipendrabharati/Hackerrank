import java.util.HashMap;

public class DesignerPDF {
    public static void main(String[] args) {
        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String word = "zaba";

        int n = word.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(letters[i], h[i]);
        }
        System.out.println(map);
        int max=0;
        for (int i = 0; i < n; i++){
            if(map.get(word.charAt(i))> max){
                max= map.get(word.charAt(i));
            }
        }
        System.out.println(max);
        int returnvalue= max * n;
        System.out.println(returnvalue);
    }
}