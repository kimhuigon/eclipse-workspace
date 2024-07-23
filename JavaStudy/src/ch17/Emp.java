package ch17;

import java.time.LocalDateTime;

// DTO - Data Transfer Object
public class Emp {
	int empno;
	String ename;
	String job;
	int mgr;
	LocalDateTime hiredate;
	int sal;
	int comm;
	int deptno;
	
	@Override
	public String toString() {
		return "Emp [empno = " + empno + ", ename = " + ename + ", job = " + job + ", mgr = " + mgr + ", hiredate = " + hiredate
				+ ", sal = " + sal + ", comm = " + comm + ", deptno = " + deptno + "]";
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public LocalDateTime getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDateTime hiredate) {
		this.hiredate = hiredate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
