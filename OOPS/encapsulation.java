package OOPS;
class encapsulation {
    private int emp_id;

    public void setEmp_id(int emp_id1) {
        emp_id = emp_id1;
    }

    public int getEmp_id() {
        return emp_id;
    }
}

    class encap
    {
        public static void main(String[] args)

        {
            encapsulation e = new encapsulation();
            e.setEmp_id(101);
            System.out.println(e.getEmp_id());
        }
    }

