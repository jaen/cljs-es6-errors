(ns let-test.core
  #_(:require [LetTest :as lt :refer [letTest]])
  (:import LetTest))

(enable-console-print!)

(println "Calling let test")

(.. js/LetTest (letTest "some argument"))

(println "Let test called")
