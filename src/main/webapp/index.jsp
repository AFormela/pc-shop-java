<html>

<head>
    <meta charset="UTF-8">
    <title>REST Documentation</title>
    <link rel="stylesheet" href="style/bootstrap.min.css">
</head>

<body>

<div class="container">
    <div class="row border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            #
        </div>
        <div class="col-xl-2">
            METHOD
        </div>
        <div class="col-xl-3">
            URL
        </div>
        <div class="col-xl-3">
            DESCRIPTION
        </div>
        <div class="col-xl-3">
            JSON
        </div>
    </div>
    <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            1
        </div>
        <div class="col-xl-2">
            GET
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/products/categories
        </div>
        <div class="col-xl-3">
            Shows available categories, based on the added products
        </div>
        <div class="col-xl-3">
            [list]
        </div>
    </div>

    <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            2
        </div>
        <div class="col-xl-2">
            GET
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/products/
        </div>
        <div class="col-xl-3">
            Shows all products
        </div>
        <div class="col-xl-3">
            {<br/>
            "id": long<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            ... rest of the fields depends on the product category ...<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            3
        </div>
        <div class="col-xl-2">
            GET
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/products/{id}
        </div>
        <div class="col-xl-3">
            Shows product based on the specific id
        </div>
        <div class="col-xl-3">
            {<br/>
            "id": long<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            ... rest of the fields depends on the product category ...<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-warning border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            4
        </div>
        <div class="col-xl-2">
            POST
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/products/{id1}/comments/{id2}
        </div>
        <div class="col-xl-3">
            Adds comment to the specific product, based on the specific id
        </div>
        <div class="col-xl-3">
            Array:<br/>
            {<br/>
            "content": String<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            5
        </div>
        <div class="col-xl-2">
            GET
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/products/{id}/comments
        </div>
        <div class="col-xl-3">
            Gets comments from the product based on the specific id
        </div>
        <div class="col-xl-3">
            Array:<br/>
            {<br/>
            "id": long,<br/>
            "content": String<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-danger text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            6
        </div>
        <div class="col-xl-2">
            DELETE
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/products/{id1}/comments{id2}
        </div>
        <div class="col-xl-3">
            Deletes comment based on the specific id (id2) from the movie based on the specific id (id1)
        </div>
        <div class="col-xl-3">

        </div>
    </div>
    <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            7
        </div>
        <div class="col-xl-2">
            GET
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/products/query?category={category}
        </div>
        <div class="col-xl-3">
            Shows products based on the specific category
        </div>
        <div class="col-xl-3">
            {<br/>
            "id": long<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            ... rest of the fields depends on the product category ...<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            8
        </div>
        <div class="col-xl-2">
            GET
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/products/query?name={name}
        </div>
        <div class="col-xl-3">
            Shows products based on the specific name
        </div>
        <div class="col-xl-3">
            {<br/>
            "id": long<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            ... rest of the fields depends on the product category ...<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            9
        </div>
        <div class="col-xl-2">
            GET
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/products/query?from={startPrice}&to={endPrice}
        </div>
        <div class="col-xl-3">
            Shows products based on the price (from -> to)
        </div>
        <div class="col-xl-3">
            {<br/>
            "id": long<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            ... rest of the fields depends on the product category ...<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-success text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            10
        </div>
        <div class="col-xl-2">
            GET
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/products/query?category={category}&name={name}&from={startPrice}&to={endPrice}
        </div>
        <div class="col-xl-3">
            Shows products based on the multiple query parameters
        </div>
        <div class="col-xl-3">
            {<br/>
            "id": long<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            ... rest of the fields depends on the product category ...<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-warning border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            11
        </div>
        <div class="col-xl-2">
            POST
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/components/cpu
        </div>
        <div class="col-xl-3">
            Adds cpu to the repositories
        </div>
        <div class="col-xl-3">
            {<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            "cores": int<br/>
            "threads": int<br/>
            "baseFrequency": int<br/>
            "turboFrequency": int<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-warning border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            12
        </div>
        <div class="col-xl-2">
            POST
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/components/ram
        </div>
        <div class="col-xl-3">
            Adds ram to the repositories
        </div>
        <div class="col-xl-3">
            {<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            "type": String<br/>
            "capacity": int<br/>
            "frequency": int<br/>
            "delay": String<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-warning border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            13
        </div>
        <div class="col-xl-2">
            POST
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/components/motherboard
        </div>
        <div class="col-xl-3">
            Adds motherboard to the repositories
        </div>
        <div class="col-xl-3">
            {<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            "depth": int<br/>
            "width": int<br/>
            "chipset": String<br/>
            "cpuSocket": String<br/>
            "raidController": boolean<br/>
            "memoryStandard": String<br/>
            "memorySlots": int<br/>
            "maxMemory": int<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-warning border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            14
        </div>
        <div class="col-xl-2">
            POST
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/components/hard-drive
        </div>
        <div class="col-xl-3">
            Adds hard drive to the repositories
        </div>
        <div class="col-xl-3">
            {<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            "format": double<br/>
            "type": String<br/>
            "capacity": int<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-warning border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            15
        </div>
        <div class="col-xl-2">
            POST
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/components/gpu
        </div>
        <div class="col-xl-3">
            Adds gpu to the repositories
        </div>
        <div class="col-xl-3">
            {<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            "dataBus": int<br/>
            "ramType": String<br/>
            "ramCapacity": int<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-primary text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            16
        </div>
        <div class="col-xl-2">
            PUT
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/components/cpu/{id}
        </div>
        <div class="col-xl-3">
            Updates cpu in the repositories based on the specific id
        </div>
        <div class="col-xl-3">
            {<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            "cores": int<br/>
            "threads": int<br/>
            "baseFrequency": int<br/>
            "turboFrequency": int<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-primary text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            17
        </div>
        <div class="col-xl-2">
            PUT
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/components/ram/{id}
        </div>
        <div class="col-xl-3">
            Updates ram in the repositories based on the specific id
        </div>
        <div class="col-xl-3">
            {<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            "type": String<br/>
            "capacity": int<br/>
            "frequency": int<br/>
            "delay": String<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-primary text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            18
        </div>
        <div class="col-xl-2">
            PUT
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/components/motherboard/{id}
        </div>
        <div class="col-xl-3">
            Updates motherboard in the repositories based on the specific id
        </div>
        <div class="col-xl-3">
            {<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            "depth": int<br/>
            "width": int<br/>
            "chipset": String<br/>
            "cpuSocket": String<br/>
            "raidController": boolean<br/>
            "memoryStandard": String<br/>
            "memorySlots": int<br/>
            "maxMemory": int<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-primary text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            19
        </div>
        <div class="col-xl-2">
            PUT
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/components/hard-drive/{id}
        </div>
        <div class="col-xl-3">
            Updates hard drive in the repositories based on the specific id
        </div>
        <div class="col-xl-3">
            {<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            "format": double<br/>
            "type": String<br/>
            "capacity": int<br/>
            }<br/>
        </div>
    </div>
    <div class="row bg-primary text-white border-bottom border-dark p-3 text-center">
        <div class="col-xl-2">
            20
        </div>
        <div class="col-xl-2">
            PUT
        </div>
        <div class="col-xl-3">
            localhost:8080/pc-shop-java/api/components/gpu/{id}
        </div>
        <div class="col-xl-3">
            Updates gpu in the repositories based on the specific id
        </div>
        <div class="col-xl-3">
            {<br/>
            "name": String<br/>
            "brand": String<br/>
            "price": double<br/>
            "quantity": int<br/>
            "dataBus": int<br/>
            "ramType": String<br/>
            "ramCapacity": int<br/>
            }<br/>
        </div>
    </div>
</div>
<div class="col-md-5">
</div>

</body>

</html>