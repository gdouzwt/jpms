module zoo.staff {

//    requires zoo.animal.feeding;
//    requires zoo.animal.care;
    requires  transitive zoo.animal.talks;
}