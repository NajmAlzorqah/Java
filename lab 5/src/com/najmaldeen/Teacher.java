package com.najmaldeen;

public class Teacher extends Human{
    private String cert;

    public Teacher(String cert , String f_name, String l_name) {
        this.cert = cert;
        setF_name(f_name);
        setL_name(l_name);
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getCert() {
        return cert;
    }

    @Override
    public void printInfo(){
        System.out.println(getF_name() +" " + getL_name() + " is a teacher and has " + cert +" Certificate" );

    }
}
