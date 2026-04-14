class BiometricRunner {

    public static void main(String... args) {

        Biometric biometric = new Biometric();

        biometric.saveBiometricName("Fingerprint");
        biometric.saveBiometricName("Iris");
        biometric.saveBiometricName("Face ID");
        biometric.saveBiometricName("Voice");
        biometric.saveBiometricName("Palm");

        biometric.saveBiometricName("Extra");

        biometric.saveBiometricName(null);

        biometric.searchBiometric("Face ID");
        biometric.searchBiometric("DNA");
    }
}