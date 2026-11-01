public class Main {

    public static void main(String[] args) {

        
        Actor actor1 = new Actor("Анна", "Нетребко", Gender.FEMALE, 168);
        Actor actor2 = new Actor("Пласидо", "Доминго", Gender.MALE, 182);
        Actor actor3 = new Actor("Рудольф", "Нуреев", Gender.MALE, 173);

     
        Director director1 = new Director("Константин", "Станиславский", Gender.MALE, 42);
        Director director2 = new Director("Борис", "Покровский", Gender.MALE, 35);

    
        Person musicAuthor = new Person("Петр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Show drama = new Show("Сато",
                150,
                director2);

       
        Opera opera = new Opera("Пиковая дама",
                180,
                director1,
                musicAuthor,
                "Мистическая драма о всепоглощающей страсти к игре, роковом секрете трех карт " +
                        "и трагической судьбе молодого инженера Германа.",
                25);

   
        Ballet ballet = new Ballet("Лебединое озеро",
                140,
                director1,
                musicAuthor,
                "Романтическая история о заколдованной принцессе Одетте, верности, предательстве " +
                        "и великой силе любви, побеждающей злые чары.",
                choreographer);

        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println();
        System.out.println(drama);
        drama.printActors();
        System.out.println();

        System.out.println(opera);
        opera.printActors();
        System.out.println();

        System.out.println(ballet);
        ballet.printActors();
        System.out.println();

       
        System.out.println("Замена актёра в спектакле «" + drama.getTitle() + "».");
        drama.replaceActor(actor3, "Нетребко");
        System.out.println();
        drama.printActors();
        System.out.println();

     
        System.out.println("Замена несуществующего актера в опере «" + opera.getTitle() + "».");
        opera.replaceActor(actor1, "Шаляпин");
        System.out.println();
        opera.printActors();
        System.out.println();

        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
    }
}
