package quanti

class Poll {
	String title
	String summary
	Date dateCreated
	Date lastUpdated
	List<Option> options
	
    static constraints = {
		title()
		summary(maxSize:1000)
		dateCreated()
		lastUpdated()
    }
}
