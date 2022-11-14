package block5;

public class StringHandler {
    public static void main(String[] args) {
        String text = "Привіт, мене звати Вова. Це мої друзі Євгеній і Федір.";
        //метод replaceAll дозволяє замінювати всі задані послідовності, задані регуляркою на задані слома/символи і тд.
        System.out.println(text.replaceAll(" і ", " та "));
    }
}
