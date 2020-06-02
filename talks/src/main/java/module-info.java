module zoo.animal.talks {
//    exports zoo.animal.talks.content to zoo.staff;
    exports zoo.animal.talks.content;
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;

//    opens zoo.animal.talks.media to zoo.staff;

//    requires zoo.animal.feeding;
//    requires zoo.animal.care;
    // 传递性依赖，等效于上面两行
    requires transitive zoo.animal.care;
}
