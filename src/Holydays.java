public class Holydays {

    String inputHolyday;

    String[] dateHolydays = new String[] {
            "01/01/2023", "21/02/2023", "17/04/2023",
            "21/04/2023", "01/05/2023", "08/06/2023",
            "07/09/2023", "12/10/2023", "02/11/2023",
            "15/11/2023", "25/12/2023" };

    String[] nameHolydays = new String[] {
            "Confraternização mundial",
            "Carnaval",
            "Páscoa",
            "Tiradentes",
            "Dia do trabalho",
            "Corpus Christi",
            "Independência do Brasil",
            "Nossa Senhora Aparecida",
            "Finados",
            "Proclamação da República",
            "Natal"
    };

    public Holydays(String holyday) {
        this.inputHolyday = holyday;
    }

    public void verifyHolyday() {

        for (int counter = 0; counter < dateHolydays.length; counter++) {
            if (dateHolydays[counter].equals(inputHolyday)) {
                System.out.println(nameHolydays[counter] + " - " + dateHolydays[counter]);
                return;
            }
        }
        System.out.println("Não existe feriado nesta data");
        ;
    }

    public void getAllHolydays() {
        System.out.println("Todos os feriados e suas datas:");
        for (int counter = 0; counter < dateHolydays.length; counter++) {
            System.out.println(nameHolydays[counter] + " - " + dateHolydays[counter]);
        }
    }

}
