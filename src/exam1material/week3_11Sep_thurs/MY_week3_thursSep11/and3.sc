// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//Prove the sequent:
//p ∧ q ∧ r ⊢ q


@pure def and3(p: B, q: B, r: B): Unit = {
  Deduce(
    (p & q & r) |- (q)
      Proof(
        //PROOF GOES HERE
        1 ( p & q & r ) by Premise,
        2 ( p & q ) by AndE1(1), // This will extract p & q (AndE1 extracts the first side of the and is which is P & q)
        3 ( q ) by AndE2(2) // AndE2 extracts the second side while AndE1 extracts the first side
      )
        
  )
}