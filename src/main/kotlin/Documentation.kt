/***
 * This is the Documentation class
 *
 * It is used to check the generation of KotlinDocs
 *
 * @param name The name of the documentation
 * @param length The length of the documentation
 */
data class Documentation(var name: String, var length: In) {

    /**
     * Adds the given element to the name
     *
     * @param element The string that gets attached to the name
     */
    fun addElement(element: String){
        name += element
    }

}