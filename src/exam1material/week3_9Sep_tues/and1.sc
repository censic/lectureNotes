// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//Given premises:  a ∧ b, c
//Use natural deduction to prove: b ∧ c


@pure def and1(a: B, b: B, c: B): Unit = {
    Deduce(
        (a & b, c) |- (b & c)
        Proof(
            //PROOF GOES HERE
            1 ( a & b ) by Premise,
            2 ( c ) by Premise,
            3 ( b ) by AndE2(1),
            4 ( b & c ) by AndI(3, 2)
<<<<<<< HEAD
            
=======
>>>>>>> 9a119d5b0c7fc088ebf84d185cfa618dfe180bfa
        )
    )
}