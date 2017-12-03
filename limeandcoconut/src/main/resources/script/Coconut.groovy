import com.lucas.springinaction.limeandcoconut.ICoconut
import com.lucas.springinaction.limeandcoconut.Lime

class Coconut implements ICoconut {
    Lime lime

    @Override
    void drinkThemBothUp() {
        println "You put the lime in the coconut..."
        println "and drink 'em both up..."
        println "You put the lime in the coconut..."
        lime.drink()
    }
}