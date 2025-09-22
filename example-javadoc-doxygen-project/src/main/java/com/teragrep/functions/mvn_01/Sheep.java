package com.teragrep.functions.mvn_01;

/**@class Sheep
 * @brief Sheeps run from dogs and are fluffy.
 *
 * @responsibilities
 * - Eat grass
 * - Run
 *
 * @collaborators
 * - Dog
 *
 * @startuml
 * class Sheep {
 *   + run()
 * }
 *
 * Dog --> Sheep : Start the running.
 *
 * note right of Sheep
 * Responsibilities:
 * - Very cute
 *
 * Collaborators:
 * - Dog
 * end note
 *
 * @enduml
 *
 */

public final class Sheep {

    public void run() {
        return;
    }

}
