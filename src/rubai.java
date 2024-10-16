public class rubai {
    public static void main(String[] args) {
        
        int consoleWidth = 40;
        char c = '\u2764';

        System.out.println(centerText("Рубаи.", consoleWidth));
        System.out.println("Много лет размышлял я над жизнью земной.");
        System.out.println("Непонятного нет для меня под луной.");
        System.out.println("Мне известно, что мне ничего не известно!");
        System.out.println("Вот последняя правда, открытая мной.");
        System.out.println(rightAlignText("О.Хайям", consoleWidth));
        System.out.print(c);
    }

    public static String centerText(String text, int width) {
        if (text.length() >= width) {
            return text;
        }
        
        int padding = (width - text.length()) / 2;
        String indent = " ".repeat(padding);
        return indent + text;
    }

    // Метод для выравнивания текста по правому краю
    public static String rightAlignText(String text, int width) {
        if (text.length() >= width) {
            return text;
        }
        
        int padding = width - text.length();
        String indent = " ".repeat(padding);
        return indent + text;
    }
}
