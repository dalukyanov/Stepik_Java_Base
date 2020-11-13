package task_2_4_3;

public class Main {

    private static String printTextPerRole(String[] roles, String[] textLines) {
        /*
        Городничий:
        1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
        4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
         */

        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < roles.length; i++) {
            res.append(roles[i] + ":\n");

            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    res.append((j+1) + ") " + textLines[j].replaceFirst(roles[i],"").replaceFirst("^: ", "") + "\n");
                }
            }
            res.append("\n");
        }
        return res.toString();
    }
    public static void main(String[] args) {

        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};

        String [] textLines={"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));
    }
}
