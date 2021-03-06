package de.oscharko.springpetclinicmonolithinkotlin.model

import java.util.*

/**
 * Created by oscharko on 16.07.22 😎
 * Check out -> www.oscharko.de
 * --------------------
 * Inside the module  - Pet-Clinic-Data
 * Inside the package - de.oscharko.springpetclinicmonolithinkotlin.model
 * --------------------
 */
class Pet() : BaseEntity() {
    constructor(petType: PetType, owner: Owner, birthDate: Date) : this()
}