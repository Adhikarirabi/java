package java_2.oop.coffee;
//https://www.homegrounds.co/best-coffee-beans-bucket-list/

class CoffeeBeans {
/*	Properties :
	beanName
	origin
	flavor
	brewed? - boolean flag indicating whether or not the beans have been brewed or not.
	roasted? - boolean flag indicating whether or not the beans have been roasted or not.  

	Methods :
	roast()

 */
private final String beanName;
    private final String origin;
    private final String flavor;
    private boolean brewed;
    private boolean roasted;

    public void roast(){
        this.roasted = true;
    }

    public String getBeanName() {
        return beanName;
    }

    public String getOrigin() {
        return origin;
    }

    public String getFlavor() {
        return flavor;
    }

    public void isBrewed() {
        brewed = true;
    }


    public boolean isRoasted() {
        return roasted;
    }

    public void setRoasted(boolean roasted) {
        this.roasted = roasted;
    }
    public CoffeeBeans(String beanName, String origin, String flavor) {
        this.beanName = beanName;
        this.origin = origin;
        this.flavor = flavor;
        this.brewed = false;
        this.roasted = false;
    }

}
