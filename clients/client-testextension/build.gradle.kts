/*
 * Copyright (C) 2022 Dremio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
  `java-library`
  jacoco
  `maven-publish`
  signing
  `nessie-conventions`
}

extra["maven.name"] = "Nessie - JUnit Jupyter Test Extension for Client-Side Tests"

dependencies {
  api(platform(libs.junit.bom))
  api(libs.junit.jupiter.api)

  implementation(project(":nessie-client"))
  implementation(project(":nessie-multi-env-test-engine"))
  implementation(libs.junit.jupiter.engine)
  implementation(libs.findbugs.jsr305)
}