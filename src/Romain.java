import java.util.Scanner;

public class Romain {
        public static int conversionChiffresRomains(String chiffreRomain) {
          int decimal = 0;
          
          for (int i = 0; i < chiffreRomain.length(); i++) {
            char c = chiffreRomain.charAt(i);
            
            switch (c) {
              case 'I':
                decimal += 1;
                break;
              case 'V':
                decimal += 5;
                if (i > 0 && chiffreRomain.charAt(i - 1) == 'I') {
                  decimal -= 2;
                }
                break;
              case 'X':
                decimal += 10;
                if (i > 0 && chiffreRomain.charAt(i - 1) == 'I') {
                  decimal -= 2;
                }
                break;
              case 'L':
                decimal += 50;
                if (i > 0 && chiffreRomain.charAt(i - 1) == 'X') {
                  decimal -= 20;
                }
                break;
              case 'C':
                decimal += 100;
                if (i > 0 && chiffreRomain.charAt(i - 1) == 'X') {
                  decimal -= 20;
                }
                break;
              case 'D':
                decimal += 500;
                if (i > 0 && chiffreRomain.charAt(i - 1) == 'C') {
                  decimal -= 200;
                }
                break;
              case 'M':
                decimal += 1000;
                if (i > 0 && chiffreRomain.charAt(i - 1) == 'C') {
                  decimal -= 200;
                }
                break;
            }
          }
          
          return decimal;
        }
        
        public static void main(String[] args) {
          String chiffreRomain;
              Scanner scanner = new Scanner(System.in);
          System.out.println("donner un chiffre romain ");
          chiffreRomain = scanner.next();
          int decimal = conversionChiffresRomains(chiffreRomain);
          scanner.close();
          System.out.println(chiffreRomain + " en nombre décimal : " + decimal);
        }
      }

      