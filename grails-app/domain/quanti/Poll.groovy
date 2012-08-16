package quanti

class Poll {
	String title
	String summary //peque–a descripcion
	Date dateCreated
	Date lastUpdated
	List<Option> options
	List<String> tags
	
    static constraints = {
		title(nullable:false)
		summary(maxSize:1000)
		dateCreated()
		lastUpdated()
    }
}
