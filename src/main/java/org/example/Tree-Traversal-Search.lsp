(defun traversal-tree-search (array search-element index)
  (declare (optimize (speed 3) (debug 0) (safety 1))) ;; TCO optimization by declaration.
  (if(>= index (length array))
      nil
    (let ((check-element(aref array index)))
      (if(= check-element search-element)
        index
        (traversal-tree-search array search-element (+ index 1))))))



(let* ((my-array (make-array 7 :initial-contents '(9 3 4 2 5 12 13)))
  (first-element(aref my-array 2))
  (array-len(length my-array))
  (counter 1)
  (adjusted-counter(+ counter 1))
  (adjusted-counter(+ adjusted-counter 1)))

  
  (format t "The index of element 5 in the given array: ~D" (traversal-tree-search my-array 5 0))
)


