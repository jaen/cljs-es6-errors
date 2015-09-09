(ns let-test.core
  (:require [LetTest :as lt :refer [letTest]])
  #_(:import LetTest))

(enable-console-print!)

(println "Calling let test")

(.. js/LetTest (letTest "some argument"))

(println "Let test called")
