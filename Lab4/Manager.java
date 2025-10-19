 public class Manager extends Employee
    {
        private String carDetails;

        public Manager(String name, Address address, Office office, String carDetails)
        {
            super(name, address, "Manager", office);            // Calls the employee constructors
            this.carDetails = carDetails;
        }

        public String getCar()
        {
            return carDetails;
        }

        public void setCar(String carDetails)
        {
            this.carDetails = carDetails;
        }

        public String toString()
        {
            return super.toString() + ". Company car : " + carDetails;
        }
    }