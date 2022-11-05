public class MyClass {
    //Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
    private String name;
    private String surName;
    private String[] courses;
    private String yourFavoriteDish;

    public MyClass(String name,String[] courses){
        this.name = name;
        this.courses = courses;
    }
    public MyClass(String name, String surName,String yourFavoriteDish){
        this.name = name;
        this.surName = surName;
        this.yourFavoriteDish = yourFavoriteDish;
    }


    public String getName() {
        return name;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getSurName() {
        return surName;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }


    public void setYourFavoriteDish(String yourFavoriteDish) {
        this.yourFavoriteDish = yourFavoriteDish;
    }

    public String getYourFavoriteDish() {
        return yourFavoriteDish;
    }
}
