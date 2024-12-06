package org.prog.collections;


    // Class representing an Owner
    public class Owner {
        private String name;

        public Owner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }

        // Override equals and hashCode to ensure Owners can be properly compared in collections
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Owner owner = (Owner) obj;
            return name.equals(owner.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }

