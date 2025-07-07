import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale sistema = Locale.getDefault();

        if (sistema.getLanguage().equals("pt")) {
            System.out.println("Seu sistema está em português.");
        } else {
            System.out.println("Seu sistema não está em português.");
        }
    }
}

