import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main {
        public static void main(String[] args) {

                    String[] words = {"upon", "sigh", "Dormouse", "jury-box", "swim"};
                    int[] counts = new int[words.length];

                    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\alice_in_wonderland.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            for (int i = 0; i < words.length; i++) {
                                int index = shiftOr(words[i], line);
                                if (index != -1) {
                                    counts[i]++;
                                }
                            }
                        }
                    } catch (IOException e) {
                        System.err.println("Dosya okuma hatası: " + e.getMessage());
                        System.exit(1);
                    }

                    for (int i = 0; i < words.length; i++) {
                        System.out.println(words[i] + " kelimesi " + counts[i] + " kez tekrar edildi.");
                    }
                }

                public static int shiftOr(String pattern, String text) {
                    int m = pattern.length();
                    int n = text.length();

                    int[] mask = new int[Character.MAX_VALUE];

                    // Önişlem: mask matrisini oluştur
                    for (int i = 0; i < m; i++) {
                        mask[pattern.charAt(i)] |= (1 << i);
                    }

                    // Shift-Or algoritması
                    int state = 0;
                    for (int i = 0; i < n; i++) {
                        state = ((state << 1) | 1) & mask[text.charAt(i)];
                        if ((state & (1 << (m - 1))) != 0) {
                            return i - m + 1;
                        }
                    }

                    return -1;





    }
}

