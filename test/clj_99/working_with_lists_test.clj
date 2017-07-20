(ns clj-99.working-with-lists-test
  (:require [clojure.test :refer :all]
            [clj-99.working-with-lists :refer :all]))



(deftest return-last-element-of-the-list
  "Should return the last elemet of the list."
  (is (= :d (my-last '(:a :b :c :d) )))
  (is (= (my-last-2 '(1 2 3)) 3 )))
