package quanti

class Vote {
	Option option
	User usr
	String comment
	String ip
	
    static constraints = {
    comment(maxSize:100)
	}
}
