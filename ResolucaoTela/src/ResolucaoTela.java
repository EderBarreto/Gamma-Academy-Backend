import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        System.out.println(" a dimensão da sua tela é: " + d.width + " X " + d.height);


    }
}
