package com.stackroute.domain;

public class Movie
    {
        Actor actorObject1;

        public Movie() {
            System.out.println("using default constructor");
        }

        public Movie(Actor actorObject1) {
            this.actorObject1 = actorObject1;
            System.out.println("using parametrized constructor");
        }

        public void setActorObject1(Actor actorObject1) {

            this.actorObject1 = actorObject1;
            System.out.println("\n Using Setter \n");
        }

        public Actor getActorObject1() {
            return actorObject1;
        }


    }
