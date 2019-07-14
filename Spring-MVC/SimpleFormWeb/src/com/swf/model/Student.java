package com.swf.model;

import java.util.Arrays;

public class Student {

	private Integer sid;
	private String sname;
	private String semail;
	private String sgender;
	private String[] courses;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(courses);
		result = prime * result + ((semail == null) ? 0 : semail.hashCode());
		result = prime * result + ((sgender == null) ? 0 : sgender.hashCode());
		result = prime * result + sid;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (!Arrays.equals(courses, other.courses))
			return false;
		if (semail == null) {
			if (other.semail != null)
				return false;
		} else if (!semail.equals(other.semail))
			return false;
		if (sgender == null) {
			if (other.sgender != null)
				return false;
		} else if (!sgender.equals(other.sgender))
			return false;
		if (sid != other.sid)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", sgender=" + sgender + ", courses="
				+ Arrays.toString(courses) + "]";
	}

}
