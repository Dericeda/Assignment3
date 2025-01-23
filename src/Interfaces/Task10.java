package Interfaces;

public class Task10 {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary {
    }

    interface Boss {
    }

    class Manager implements Boss,Person,HasManagementPotential{
        public void use(Person person) {
            person.startToWork();
        }
        public void startToWork() {
        }
        public boolean inspiresOthersToWork() {
            return true;
        }
    }
    class Subordinate implements Secretary,Person {
        public void use(Person person) {
        }
        public void startToWork() {
        }
    }
}
