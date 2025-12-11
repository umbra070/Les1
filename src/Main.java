//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



void main() {
    //Переменные и синтаксис
    //*************************************
    //Ex1-3
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    var i = 4; //Ex2
    var friend = 19; //Ex4
    var frog = 3.5; //Ex5
    //Ex6
    var firstBoxerMass = 78.2;
    var secondBoxerMass = 82.7;
    //Ex8
    var totalHours = 640;
    var hourPerPerson = 8;
    var newPersons = 94;
    var totalPersons = 0;
    IO.println("\n\rПеременные и синтаксис\n\r**************************************");
    IO.println(String.format("Ex1\n\rVariable dog = %f\n\rVariable cat = %f\n\rVariable paper = %d", dog, cat, paper));
    IO.println(String.format("Ex2\n\rVariable dog + 4 = %f\n\rVariable cat + 4 = %f\n\rVariable paper + 4 = %d", dog+i, cat+i, paper+i));
    IO.println(String.format("Ex3\n\rVariable dog - 3.5 = %f\n\rVariable cat - 1.6 = %f\n\rVariable paper - 7639 = %d", dog-3.5, cat-1.6, paper-7639));
    IO.println(String.format("Ext4\n\rOperation1: friend = %d\n\rOperation2: friend + 2 = %d\n\rOperation3: friend / 7 = %d",friend, friend=friend+2, friend/7));
    IO.println(String.format("Ex5\n\rOperation1: frog = %f\n\rOperation2: frog * 10 = %f\n\rOperation3: frog / 3.5 = %f\n\rOperation4: frog + 4 = %f", frog, frog=frog*10, frog=frog/3.5, frog+4 ));
    IO.println(String.format("Ex6\n\rBoxer1 mass = %f\n\rBoxer2 mass = %f\r\nTotal mass of boxers = %f\n\rMass difference of boxers = %f\n\rEx7\n\rRemainder after division = %f",firstBoxerMass, secondBoxerMass, firstBoxerMass+secondBoxerMass, secondBoxerMass-firstBoxerMass, secondBoxerMass%firstBoxerMass));
    IO.println(String.format("Ex8.1\n\rВсего работников в компании %d\n\rEx8.2\n\rЕсли в компании работает %d человек, то всего %d часов работы может быть поделено между сотрудниками",totalPersons=totalHours/hourPerPerson, totalPersons=totalPersons+newPersons, totalHours/totalPersons));
    IO.println("**************************************");
    //*************************************
}


