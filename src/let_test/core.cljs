(ns let-test.core
  (:require [LetTest :as lt :refer [letTest]]))

(enable-console-print!)

(println "Calling let test")

; this should work
(lt/letTest "some argument")

; as should this
(letTest "some argument")

(println "Let test called")
