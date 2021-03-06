/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright 2019, Green Hope Falcons
 */

package org.ghrobotics.frc2017.commands

import org.ghrobotics.frc2017.subsystems.Agitator
import org.ghrobotics.lib.commands.FalconCommand
import org.ghrobotics.lib.utils.Source

class OpenLoopAgitatorCommand(private val percentSource: Source<Double>) : FalconCommand(Agitator) {
  override fun execute() {
    Agitator.setOpenLoop(percentSource())
  }

  override fun end(interrupted: Boolean) {
    Agitator.setNeutral()
  }
}
