(ns demo.core)

; js: document.body.style.border = "";
(set! (.-margin (.-style (.-body js/document))) "20px")

; js: document.body.style.margin = "";
(set! (.-border (.-style (.-body js/document))) "10px solid purple")

; js: document.body.style.boxShadow = "";
(set! (.-boxShadow (.-style (.-body js/document))) "0 0 5px 5px purple")
