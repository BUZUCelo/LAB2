package restaurant;

public class Chef {
    private String name;
    private String specialization;
    private int experience;

    private Chef(ChefBuilder builder) {
        this.name = builder.name;
        this.specialization = builder.specialization;
        this.experience = builder.experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public static class ChefBuilder {
        private String name;
        private String specialization;
        private int experience;

        public ChefBuilder(String name) {
            this.name = name;
        }

        public ChefBuilder setSpecialization(String specialization) {
            this.specialization = specialization;
            return this;
        }

        public ChefBuilder setExperience(int experience) {
            this.experience = experience;
            return this;
        }

        public Chef build() {
            return new Chef(this);
        }
    }
}


