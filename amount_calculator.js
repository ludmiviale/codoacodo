function calculateAmount() {
    let price = 200
    let quantity = document.getElementById("quantity").value
    let percentage = document.getElementById("category").value
    percentage = (100-percentage)/100
    let totalAmount = price*quantity*percentage
document.getElementById("amount").innerHTML = totalAmount
}

function resetAmount() {
    document.getElementById("amount").innerHTML = ""
}