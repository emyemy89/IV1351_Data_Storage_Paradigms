/*
 * The MIT License (MIT)
 * Copyright (c) 2020 Leif Lindbäck
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction,including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so,subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */



package se.kth.iv1351.bankjdbc.model;

/**
 * Represents an instrument in the music rental application
 */
public class Instrument implements InstrumentDTO {
    private final int instrumentId;
    private final String serialNumber;
    private final String instrumentName;
    private final String brand;
    private final String rentalPrice;
    private final String status;

    /**
     * Creates a new instance representing an instrument.
     *
     * @param   instrumentId The ID of the instrument.
     * @param serialNumber The serial number of the instrument.
     * @param  instrumentName The name of the instrument.
     * @param   brand The brand of the instrument.
     * @param rentalPrice The rental price of the instrument.
     * @param status The status of the instrument (e.g., available or rented).
     */
    public Instrument(int instrumentId, String serialNumber, String instrumentName, String brand, String rentalPrice, String status) {
        this.instrumentId = instrumentId;
        this.serialNumber = serialNumber;
        this.instrumentName = instrumentName;
        this.brand = brand;
        this.rentalPrice = rentalPrice;
        this.status = status;
    }

    public int getInstrumentId() {
        return instrumentId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public String getBrand() {
        return brand;
    }

    public String getRentalPrice() {
        return rentalPrice;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Instrument [instrumentId=" + instrumentId + ", serialNumber=" + serialNumber + ", instrumentName=" + instrumentName
                + ", brand=" + brand + ", rentalPrice=" + rentalPrice + ", status=" + status + "]";
    }

    public boolean isAvailable() { 
        return "available".equalsIgnoreCase(status); 
    }
}
