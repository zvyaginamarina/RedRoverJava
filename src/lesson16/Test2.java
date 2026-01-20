package lesson16;

public class Test2 {

    public static void main(String[] args) {
        String s1 = "С другой стороны, семантический разбор внешних противодействий способствует подготовке и реализации модели развития. Ясность нашей позиции очевидна: перспективное планирование позволяет выполнить важные задания по разработке модели развития!";
        String s2 = s1.toUpperCase();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != ',' && c1 != '.' && c1 != ':' && c1 != '!' && c1 == c2) {
                System.out.println();
                System.out.println(c1);
            }
            System.out.println(c1);
        }
        System.out.println();
    }
}
