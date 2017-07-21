(ns clj-99.working-with-lists-test
  (:require [clojure.test :refer :all]
            [clj-99.working-with-lists :refer :all]))

(deftest my-last-test
  "Should return the last elemet of the list."
  (is (= :d (my-last '(:a :b :c :d))))
  (is (=  3 (my-last-2 '(1 2 3)))))


(deftest but-my-last-test
  "Find the last butone element of a list"
  (is (= '(3 4) (but-my-last '(1 2 3 4))))
  (is (= '(:c :d) (but-my-last '(:a :b :c :d)))))

(deftest element-at-test
  "Find the K'th element of a list."
  (is (= 3 (element-at '(1 2 3 4 5) 3)))
  (is (= :b (element-at '(:a :b :c :d :e) 2)))
  (is (= 3 (element-at-k '(1 2 3 4 5) 3)))
  (is (= :b (element-at-k '(:a :b :c :d :e) 2)))
  (is (= 3 (element-at-k-2 '(1 2 3 4 5) 3)))
  (is (= :b (element-at-k-2 '(:a :b :c :d :e) 2))))




